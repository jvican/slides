int main(int argc, char const* argv[])
{
  Defn.Object(Nil,
      Term.Name("State"), Foo.Bar(1, Template(Nil, Seq( Ctor.Ref.Name("ScalaFmtLogger")),
          Term.Param(
            Nil,
            Name.Anonymous(), None, None)),
        Some()), Term.Name("gofmt") )

  return 0;
}
