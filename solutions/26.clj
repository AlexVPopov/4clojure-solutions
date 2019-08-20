(fn [n]
  (loop [result [1 1]
         x n]
    (if (= (count result) n)
      result
      (recur (conj result
                   (+ (last result)
                      (-> result reverse second)))
             (dec x)))))
