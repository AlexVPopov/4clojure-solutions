; version 1

(fn sym-tree?
  ([[_ left right]] (sym-tree? left right))
  ([[root-1 left-1 right-1]
    [root-2 left-2 right-2]] (and (= root-1 root-2)
                                  (if (sequential? left-1) (sym-tree? left-1 right-2) (= left-1 right-2))
                                  (if (sequential? left-2) (sym-tree? left-2 right-1) (= left-2 right-1)))))

; version 2

(defn sym-tree?
  ([[_ left right]] (sym-tree? left right))
  ([[root-1 left-1 right-1 :as left]
    [root-2 left-2 right-2 :as right]]
   (or (= nil left right)
       (and (= root-1 root-2)
            (sym-tree? left-1 right-2)
            (sym-tree? left-2 right-1)))))
