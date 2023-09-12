(ns [grokking-algorithms.chapter1 :refer [busca-completa]] 
  (:require [clojure.test :refer [deftest]]))

(def lista [1 2 3 4 5 6 7 8])

(deftest busca-completa-test
  (is (= (busca-completa 5 lista)
         5)))