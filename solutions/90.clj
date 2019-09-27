; version 1

(fn [set-1 set-2]
  (set (apply concat (map (fn [a]
                            (map (fn [b] [b a])
                                 set-1))
                          set-2))))

; version 2

#(set (for [a %1 b %2] [a b]))
