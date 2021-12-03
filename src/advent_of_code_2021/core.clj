(ns advent-of-code-2021.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main
  "Advent of Code."
  [& args]
  (println "Advent of Code 2021"))



(defn- read-input [day]
  (->>  ".in"
        (str day)
        (str "inputs/day")
        slurp
        str/split-lines
        ))

;; day 1
;; silver
(->> (read-input "1")
     (map #(Integer/parseInt %))
     (partition 3 1)
     (map #(reduce + %))
     (partition 2 1)
     (filter #(< (first %) (second %)))
     count)

;; gold
(->> (read-input "1")
     (map #(Integer/parseInt %))
     (partition 3 1)
     (map #(reduce + %))
     (partition 2 1)
     (filter #(< (first %) (second %)))
     count)

;; day 2
