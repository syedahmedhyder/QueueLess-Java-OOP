
import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLess extends JFrame {
    private final Queue<Integer> waiting = new LinkedList<>();
    private int nextToken = 1;
    private final JLabel current = new JLabel("Current Token: None");
    private final JLabel status = new JLabel("Welcome! Generate a token.");
    private final JTextArea list = new JTextArea(8, 25);

    public QueueLess() {
        setTitle("QueueLess - Virtual Queue Simulator");
        setSize(420, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel heading = new JLabel("QueueLess", JLabel.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 26));
        add(heading, BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(3, 1, 8, 8));
        current.setHorizontalAlignment(JLabel.CENTER);
        current.setFont(new Font("Arial", Font.BOLD, 20));
        status.setHorizontalAlignment(JLabel.CENTER);
        center.add(current);
        center.add(status);

        list.setEditable(false);
        list.setFont(new Font("Monospaced", Font.PLAIN, 15));
        center.add(new JScrollPane(list));
        add(center, BorderLayout.CENTER);

        JPanel buttons = new JPanel(new GridLayout(2, 2, 8, 8));
        JButton generate = new JButton("Generate Token");
        JButton call = new JButton("Call Next");
        JButton view = new JButton("View Queue");
        JButton reset = new JButton("Reset Queue");

        buttons.add(generate);
        buttons.add(call);
        buttons.add(view);
        buttons.add(reset);
        add(buttons, BorderLayout.SOUTH);

        generate.addActionListener(e -> {
            waiting.offer(nextToken);
            status.setText("Token " + nextToken + " generated.");
            nextToken++;
            refresh();
        });

        call.addActionListener(e -> {
            if (waiting.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                    "No tokens are waiting.");
            } else {
                int token = waiting.poll();
                current.setText("Current Token: " + token);
                status.setText("Now serving token " + token);
                refresh();
            }
        });

        view.addActionListener(e -> {
            refresh();
            JOptionPane.showMessageDialog(this,
                waiting.isEmpty() ? "Queue is empty."
                    : "Waiting tokens: " + waiting);
        });

        reset.addActionListener(e -> {
            waiting.clear();
            nextToken = 1;
            current.setText("Current Token: None");
            status.setText("Queue has been reset.");
            refresh();
        });

        refresh();
    }

    private void refresh() {
        list.setText("");
        for (int token : waiting) {
            list.append("Token " + token + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
            new QueueLess().setVisible(true));
    }
}
