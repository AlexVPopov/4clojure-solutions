(fn tree? [s]
  (if (sequential? s)
    (and (= 3 (count s)) (every? tree? (rest s)))
    (nil? s)))
