/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.node;

import com.google.clearsilver.jsilver.syntax.analysis.*;

@SuppressWarnings("nls")
public final class THardDelimiter extends Token
{
    public THardDelimiter(String text)
    {
        setText(text);
    }

    public THardDelimiter(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new THardDelimiter(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTHardDelimiter(this);
    }
}
