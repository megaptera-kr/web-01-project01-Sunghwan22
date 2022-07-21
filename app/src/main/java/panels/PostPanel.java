package panels;

import frame.PostDetailPageFrame;
import models.Comment;
import models.Post;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class PostPanel extends JPanel {


  public PostPanel(List<Post> posts, Post post, Comment comment,
                   List<Comment> comments, JPanel mainPanel) {
    this.removeAll();

    JPanel panel = new JPanel();
    this.add(panel);

    JPanel containerPanel = new JPanel();
    panel.add(containerPanel);

    JLabel titleLabel = new JLabel("작성자: " + post.nickName() + post.title());

    titleLabel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent event) {
        PostDetailPageFrame postDetailPageFrame = new PostDetailPageFrame(post, posts,
            mainPanel, comments, comment);
        postDetailPageFrame.setVisible(true);
      }
    });
    containerPanel.add(titleLabel);
  }
}