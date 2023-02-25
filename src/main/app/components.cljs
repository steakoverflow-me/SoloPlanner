(ns app.components
  (:require [com.fulcrologic.fulcro.components :as comp :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]))

(defsc Greeter
  [this {:greeter/keys [name]}] ; parameters. Available in body, and in *some* of the options
  {:with-hooks? true}                                      ; optional:  { ...options... }
  (dom/div :.text-amber-600#hello
           (dom/p "Hello, " name "!")))

(def ui-greeter (comp/factory Greeter))

