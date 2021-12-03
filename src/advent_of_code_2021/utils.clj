(ns advent-of-code-2021.utils
  (:require [clojure.string :as str])
  (:gen-class))

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
       clojure.pprint/pprint))
