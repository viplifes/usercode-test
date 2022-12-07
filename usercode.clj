(ns usercode.usercode)

(defn handle [data]
    (assoc data :test-key "test-val"))