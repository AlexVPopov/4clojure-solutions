; version 1

(fn inf [& args]
  (let [[operand-1 operation operand-2 & rest] args
        result (operation operand-1 operand-2)]
    (if rest (apply inf (concat [result] rest)) result)))

; version 2

(fn [a & args]
  (if (empty? args) a (recur ((first args) a (second args)) (drop 2 args))))
