import org.scalatest.FunSuite

/**
  * Created by bhavika on 6/25/17.
  */

class StringProcessorTest extends FunSuite {

  test("replace_non_letters")
  {
    assert(StringProcessor.replace_non_letters_non_numbers_with_whitespaces("bhavika $56 here whit# sp23ace") == "bhavika  56 here whit  sp23ace")
  }

  test("test_to_lower_case")
  {
    assert(StringProcessor.to_lower_case("san francisco GIAnts") == "san francisco giants")
  }

  test("test_to_upper_case")
  {
    assert(StringProcessor.to_upper_case("san francisco GianTs") == "SAN FRANCISCO GIANTS")
  }

  test("test_strip_spaces")
  {
    assert (StringProcessor.strip(" new york mets  ") == "new york mets")
  }


}
