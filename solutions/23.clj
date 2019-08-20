; with reduce

(fn [coll] (reduce #(cons %2 %) (seq nil) coll))

; recursively

(fn my-reverse
  [coll]
  (if (= (count coll) 1)
    coll
    (cons (last coll) (my-reverse (butlast coll)))))
