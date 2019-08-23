; version 1

(defn my-range
  [start finish]
  (if (= 1 (- finish start))
    [start]
    (concat [start] (my-range (inc start) finish))))

; version 2

#(take (- %2 %) (iterate inc %))
