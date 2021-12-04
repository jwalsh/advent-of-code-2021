(ns advent-of-code-2021.utils
  (:require [clojure.string :as str])
  (:use [clojure.pprint]))

(defn read-input [day]
  "Get line by line inputs without secondary processing."
  (->>  ".in"
        (str day)
        (str "inputs/day")
        slurp
        str/split-lines))

(defn debug [seq]
  (->> seq
       (take 10)
       pprint))

(defn solution [sol data]
  (println data)
  (def start-time (.getTime (java.util.Date.)))
  (sol data)
  (def end-time (.getTime (java.util.Date.)))
  (def elapsed-time (- end-time start-time))
  (pprint (str "Elapsed time: " elapsed-time "ms")))
