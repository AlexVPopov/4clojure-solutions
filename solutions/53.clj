; creates a sequence of increasing sequences and gets the first one of the 
; group of sequences with highest counts

; version 1

(fn [coll]
  (->> (reduce #(if (empty? %)
                  [[%2]]
                  (if (> %2 (last (last %)))
                    (conj (pop %) (conj (peek %) %2))
                    (conj % [%2])))
               []
               coll)
       (filter #(> (count %) 1))
       (reduce #(if (> (count %2) (count %)) %2 %) [])))

; version 2

(fn [coll]
  (->> (reductions #(if (= %2 (inc (last %))) (conj % %2) [%2]) [0] coll)
       (filter #(> (count %) 1))
       (reduce #(if (> (count %2) (count %)) %2 %) [])))
