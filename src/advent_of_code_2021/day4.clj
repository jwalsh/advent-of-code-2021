(ns advent-of-code-2021.day4
  (:require [clojure.string :as str]
            [advent-of-code-2021.utils :as u]))

(defn day4 []
  (->> (u/read-input "4")
       u/debug))

(def day-4
  (->> "7,4,9,5,11,17,23,2,0,14,21,24,10,16,13,6,15,25,12,22,18,20,8,19,3,26,1

22 13 17 11  0
 8  2 23  4 24
21  9 14 16  7
 6 10  3 18  5
 1 12 20 15 19

 3 15  0  2 22
 9 18 13 17  5
19  8  7 25 23
20 11 10 24  4
14 21 16 12  6

14 21 17 24  4
10 16 15  9 19
18  8 23 26 20
22 11 13  6  5
 2  0 12  3  7"
       str/split-lines))

(quote
 (->> (u/read-input "3") ;; day-3
      (map #(map-indexed (fn [idx itm] [(str idx) itm]) %))
      (mapcat identity)
      frequencies
      (sort-by first)
      (partition 2)
      )
 )

(quote
 (* (Integer/parseInt "101000010000" 2) (Integer/parseInt "010111101111" 2))
 )

(quote
 (day4)
 )
