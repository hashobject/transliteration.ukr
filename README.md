# transliteration.ukr

A Clojure library for transliteration cyrillic Ukrainian words to latin. Was implemented with following
[Ukrainian law](http://zakon1.rada.gov.ua/cgi-bin/laws/main.cgi?nreg=55-2010-%EF) in mind.

All test cases from the law are implemented.


[![Dependencies Status](http://jarkeeper.com/hashobject/transliteration.ukr/status.png)](http://jarkeeper.com/hashobject/transliteration.ukr)

## Usage

```

  (use 'transliteration.ukr)

  (transliterate "Алушта")
  ;; "Alushta"

  (transliterate "Україна")
  ;; "Ukraina"

```

## License

Copyright © 2013-2014 Hashobject Ltd (team@hashobject.com).

Distributed under the [Eclipse Public License](http://opensource.org/licenses/eclipse-1.0).
