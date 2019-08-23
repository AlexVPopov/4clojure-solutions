; version 1

#(apply interleave (repeat %2 %))

; version 2

(fn [coll n] (mapcat (partial repeat n) coll))
