//package com.shaiyallin
//
//import org.specs2.mutable.Specification
//
//class RomanNumeralsTest extends Specification {
//  "roman numerals generator" should {
//    "return an empty string for zero input" in {
//      Generator.generate(0) must_== ""
//    }
//
//    "return I for input of '1'" in {
//      Generator.generate(1) must_== "I"
//    }
//
//    "return II for input of '2'" in {
//      Generator.generate(2) must_== "II"
//    }
//
//    "return IV for input of '4'" in {
//      Generator.generate(4) must_== "IV"
//    }
//
//    "return V for input of '5'" in {
//      Generator.generate(5) must_== "V"
//    }
//
//    "return VIII for input of '8'" in {
//      Generator.generate(8) must_== "VIII"
//    }
//
//    "return X for input of '10'" in {
//      Generator.generate(10) must_== "X"
//    }
//  }
//
//}