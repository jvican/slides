object Pathological {
  Defn.Object(
      Nil,
      Term.Name("State"),
      Template(
          Nil,
          Seq(Ctor.Ref.Name("ScalaFmtLogger")),
          Term.Param(Nil, Name.Anonymous(), None, None),
          Some(Seq(Defn
                     .Val(
                       Nil,
                       Seq(Pat.Var.Term(Term.Name("start"))),
                       None,
                       Term.Apply(
                           Term.Name("State"),
                           Seq(Lit(0),
                               Term.Name("identity"),
                               Term.ApplyType(Term.Select(Term.Name("Vector"),
                                                          Term.Name("empty")),
                                              Seq(Type.Name("Split"))),
                               Term.ApplyType(Term.Select(Term.Name("Vector"),
                                                          Term.Name("empty")),
                                              Seq(Type.Name("State"))),
                               Lit(0),
                               Term.ApplyType(
                                   Term.Select(Term.Name("Vector"),
                                               Term.Name("empty")),
                                   Seq(Type.Apply(Type.Name("Indent"),
                                                  Seq(Type.Name("Num"))))),
                               Lit(0)))),
                   Defn.Def()))))
}

