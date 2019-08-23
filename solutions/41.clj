; version 1

(fn [coll n] (mapcat #(take (dec n) %) (partition-all n coll)))

; version 2

#(apply concat (partition-all (dec %2) %2 %))
