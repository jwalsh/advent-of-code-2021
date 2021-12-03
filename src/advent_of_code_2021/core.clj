(ns advent-of-code-2021.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn -main
  "Advent of Code."
  [& args]
  (println "Advent of Code 2021"))

(defn- read-input [day]
  "Get line by line inputs without secondary processing."
  (->>  ".in"
        (str day)
        (str "inputs/day")
        slurp
        str/split-lines))

(defn- debug [seq]
  (->> seq
       (take 10)
       println))
;; day 1
;; silver
(quote
 (->> (read-input "1")
      (map #(Integer/parseInt %))
      (partition 2 1)
      ;; debug
      (filter #(< (first %) (second %)))
      count)
 )

;; gold
(quote
 (->> (read-input "1")
      (map #(Integer/parseInt %))
      (partition 3 1)
      (map #(reduce + %))
      (partition 2 1)
      (filter #(< (first %) (second %)))
      ;; debug
      count)
 )

;; day 2
(defn day2 []
  "Dive!"
  (->> (read-input "2")
       println))

(quote
 (day2)
 )

;; ((:down {:down (fn [n] n)}) 5)
(defn day3 []
  (->> (read-input "3")
       println))

(quote
 (day3)
 )
