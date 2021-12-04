(ns advent-of-code-2021.day3
  (:require [clojure.string :as str]
            [advent-of-code-2021.utils :as u]))


;; ((:down {:down (fn [n] n)}) 5)
(defn day3 []
  (->> (u/read-input "3")
       u/debug))

(def day-3
  (->> "00100
11110
10110
10111
10101
01111
00111
11100
10000
11001
00010
01010"
       str/split-lines))

;; (read-input "3")
(->> (u/read-input "3") ;; day-3
     (map #(map-indexed (fn [idx itm] [(str idx) itm]) %))
     (mapcat identity)
     frequencies
     (sort-by first)
     (partition 2)
     )

(* (Integer/parseInt "101000010000" 2) (Integer/parseInt "010111101111" 2))

(quote
 (day3)
 )
