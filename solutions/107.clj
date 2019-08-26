; version 1

(fn [n] #(reduce * (repeat n %)))

; version 2

partial #(reduce * (repeat % %2))
