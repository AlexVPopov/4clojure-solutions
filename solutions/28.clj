; Difference between seq?, coll?, sequential? - https://stackoverflow.com/a/22439707
; Overview of sequence and collections - https://www.brainonfire.net/files/seqs-and-colls/main.html

; version 1

(fn [coll]
  (if (some sequential? coll)
    (recur (reduce #(if (coll? %2) (into % %2) (conj % %2)) [] coll))
    coll))

; version 2

(fn flattenner [x] (if (sequential? x) (mapcat flattenner x) (vector x)))

; version 3

(fn [coll] (filter #(not (sequential? %)) (tree-seq sequential? identity coll)))
