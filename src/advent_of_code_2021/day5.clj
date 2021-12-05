(ns advent-of-code-2021.day5
  (:require [clojure.string :as str]
            [advent-of-code-2021.utils :as u]))

(defn day5 []
  (->> (u/read-input "5")
       u/debug))

(def day-5
  (->> ""
       str/split-lines))
