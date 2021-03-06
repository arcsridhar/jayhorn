package soottocfg.ast.Absyn; // Java Package generated by the BNF Converter.

public class Jmp extends Stm {
  public final JumpStm jumpstm_;
  public Jmp(JumpStm p1) { jumpstm_ = p1; }

  public <R,A> R accept(soottocfg.ast.Absyn.Stm.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof soottocfg.ast.Absyn.Jmp) {
      soottocfg.ast.Absyn.Jmp x = (soottocfg.ast.Absyn.Jmp)o;
      return this.jumpstm_.equals(x.jumpstm_);
    }
    return false;
  }

  public int hashCode() {
    return this.jumpstm_.hashCode();
  }


}
