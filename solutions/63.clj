; version 1

(fn [func sequence]
  (into {} (map (fn [output]
                  {output (vec (map first
                                    (filter (fn [result] (= (second result) output))
                                            (map (fn [e] [e (func e)]) sequence))))})
                (set (map func sequence)))))

; version 2

(fn [func sequence]
  (reduce (fn [aggregate element]
            (let [output (func element)]
              (assoc aggregate output (conj (get aggregate output []) element))))
          {}
          sequence))

; version 3

(fn [func sequence]
  (apply merge-with concat (map (fn [x] {(func x) [x]}) sequence)))
