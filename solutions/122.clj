; version 1

#(BigInteger. % 2)

; version 2

(read-string (str "2r" "111"))

; version 3

#(Integer/parseInt % 2)

; version 4

(fn [s] (reduce + 0 (map-indexed (fn [idx i]
                                   (if (= \1 i) (int (Math/pow 2 idx)) 0))
                                 (reverse s))))
