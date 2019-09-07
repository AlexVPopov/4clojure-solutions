(fn [a b]
  (let [[a b] (if (> a b) [a b] [b a])]
    (if (zero? b) a (recur b (rem a b)))))
