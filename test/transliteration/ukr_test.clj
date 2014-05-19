(ns transliteration.ukr-test
  (:use clojure.test
        transliteration.ukr))

(deftest capital-letter-test
  (testing "Capital letter should remain capital"
    (is (= (transliterate "Алушта") "Alushta")))
  (testing "Capital letter should remain capital"
    (is (= (transliterate "Харків") "Kharkiv")))
  (testing "Capital letter should remain capital"
    (is (= (transliterate "Україна") "Ukraina"))))


(deftest ignored-characters-test
  (testing "Apostrophe should be ignored"
    (is (= (transliterate "в'язень") "viazen")))
  (testing "Soft sign should be ignored"
    (is (= (transliterate "Львів") "Lviv"))))



(deftest zgh-test
  (testing "Zgh special case"
    (is (= (transliterate "Згорани") "Zghorany")))
  (testing "zgh special case"
    (is (= (transliterate "розгон") "rozghon"))))
