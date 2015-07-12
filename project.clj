(defproject yogthos/iText "4.2.0"
  :description "This is a build of the last LGPL/MPL version of iText."
  :url "https://github.com/yogthos/iText-4.2.0"
  :license {:name "GNU General Lesser Public License (LGPL) version 3.0"
            :url "http://www.gnu.org/licenses/lgpl.html"
            :distribution :repo
            :comments "same as  iText and JFreeChart"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [bouncycastle/bctsp-jdk14 "138"]
                 [org.jfree/jfreechart "1.0.15"]
                 [com.lowagie/itext "4.2.1"]
                 [org.apache.xmlgraphics/batik-gvt "1.7"]
                 [dom4j "1.6.1"]
                 [jfree/jfreechart "1.0.12"]
                 [org.swinglabs/pdf-renderer "1.0.5"]]

  :java-source-paths ["src"]
  ;:prep-tasks [["compile" "com.lowagie"] "javac" "compile"]

  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[junit "4.4"]
                                  [environ "0.5.0"]
                                  [javax.servlet/servlet-api "2.5"]]}})