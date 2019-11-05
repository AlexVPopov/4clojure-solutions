; version 1

(fn [row]
  (let [fact (fn [n]
               (loop [x n result 1]
                 (if (zero? x)
                   result
                   (recur (dec x) (* x result)))))
        binomial (fn [row column]
                   (let [row (dec row) column (dec column)]
                     (/ (fact row)
                        (* (fact (- row column))
                           (fact column)))))]
    (map #(binomial row %) (range 1 (inc row)))))

; version 2

(fn [n]
  (loop [n (dec n)
         r (vector 1)]
    (if (zero? n)
      r
      (recur (dec n)
             (concat [1]
                     (map  #(+ (nth r %) (nth r (dec %)))
                           (range 1 (count r)))
                     [1])))))
