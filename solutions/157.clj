; version 1

(fn [coll] (map-indexed (fn [idx x] [x idx]) coll))

; version 2

(fn [coll] (map vector coll (range)))
