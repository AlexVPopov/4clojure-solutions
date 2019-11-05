(fn [coll]
  (count (filter (fn [x] (< x
                            (->> (str x)
                                 (#(clojure.string/split % #""))
                                 (map (comp #(* % %) read-string))
                                 (reduce +))))
                 coll)))
