(fn my-map [f [first-element & remaining-elements]]
  (lazy-seq
   (when first-element
     (cons (f first-element) (my-map f remaining-elements)))))
