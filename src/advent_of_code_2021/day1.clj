(ns advent-of-code-2021.day1
  (:require [clojure.string :as str]
            [advent-of-code-2021.utils :as u]))


;; day 1
;; silver
(quote
 (->> (u/read-input "1")
      (map #(Integer/parseInt %))
      (partition 2 1)
      ;; u/debug
      (filter #(< (first %) (second %)))
      count)
 )

;; gold
(quote
 (->> (u/read-input "1")
      (map #(Integer/parseInt %))
      (partition 3 1)
      (map #(reduce + %))
      (partition 2 1)
      (filter #(< (first %) (second %)))
      ;; u/debug
      count)
 )
