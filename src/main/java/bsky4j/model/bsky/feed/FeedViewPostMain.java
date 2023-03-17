package bsky4j.model.bsky.feed;

import javax.annotation.Nullable;

public class FeedViewPostMain {

    private FeedPostView post;
    @Nullable
    private FeedViewPostReplyRef reply;
    @Nullable
    private FeedViewPostReason reason;

    // region // Getter&Setter
    public FeedPostView getPost() {
        return post;
    }

    public void setPost(FeedPostView post) {
        this.post = post;
    }

    @Nullable
    public FeedViewPostReplyRef getReply() {
        return reply;
    }

    public void setReply(@Nullable FeedViewPostReplyRef reply) {
        this.reply = reply;
    }

    @Nullable
    public FeedViewPostReason getReason() {
        return reason;
    }

    public void setReason(@Nullable FeedViewPostReason reason) {
        this.reason = reason;
    }
    // endregion
}
