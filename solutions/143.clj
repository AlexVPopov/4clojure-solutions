(fn [coll-1 coll-2]
  (reduce + (map * coll-1 coll-2)))
