(ns explore-clojure-web.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [explore-clojure-web.core-test]))

(enable-console-print!)

(doo-tests 'explore-clojure-web.core-test)
