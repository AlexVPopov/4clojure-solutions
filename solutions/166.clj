; version 1

(fn [comp a b]
  (if (comp a b)
    :lt
    (if (comp b a)
      :gt
      :eq)))

; version 2

(fn [comp a b]
  (cond
    (comp a b) :lt
    (comp b a) :gt
    :else :eq))
