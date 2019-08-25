; version 1

(fn [d coll] (reduce #(assoc % %2 d) {} coll))

; version 2

#(apply hash-map (interleave %2 (repeat %)))

; version 3

#(apply assoc {} (interleave %2 (repeat %)))

; version 4

#(zipmap %2 (repeat %))
