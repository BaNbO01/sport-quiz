(ns sport-quiz.frontend
  (:require [reagent.dom :as rd]))

(defn app-root []
  [:div
   [:h1 "Sport Quiz"]
   [:p "Frontend placeholder — Reagent UI will be implemented in Step 5."]])

(defn ^:export init []
  (rd/render [app-root] (.getElementById js/document "app")))
