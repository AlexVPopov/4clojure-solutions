; version 1

(fn lcm [a b & rest]
  (let [gcd (fn [a b] (loop [a a b b] (if (zero? b) a (recur b (mod a b)))))
        lcm-of-a-and-b (/ (* a b) (gcd a b))]
    (if (empty? rest)
      lcm-of-a-and-b
      (apply lcm (concat [lcm-of-a-and-b] rest)))))

; version 2

(fn lcm [& x]
  (let [gcd (fn [a b] (loop [a a b b] (if (zero? b) a (recur b (mod a b)))))]
    (reduce (fn [a b] (/ (* a b) (gcd a b))) x)))
