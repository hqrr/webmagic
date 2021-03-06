package us.codecraft.webmagic.model;

import us.codecraft.webmagic.selector.Selector;

/**
 * The object contains 'ExtractBy' information.
 * @author code4crafter@gmail.com <br>
 * @since 0.2.0
 */
public class Extractor {

    protected Selector selector;

    protected Source source;

    protected boolean notNull;

    protected boolean multi;

    public static enum Source {Html, Url, RawHtml}

    public Extractor(Selector selector, Source source, boolean notNull, boolean multi) {
        this.selector = selector;
        this.source = source;
        this.notNull = notNull;
        this.multi = multi;
    }

    public Selector getSelector() {
        return selector;
    }

    public Source getSource() {
        return source;
    }

    public boolean isNotNull() {
        return notNull;
    }

    public boolean isMulti() {
        return multi;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }
}
