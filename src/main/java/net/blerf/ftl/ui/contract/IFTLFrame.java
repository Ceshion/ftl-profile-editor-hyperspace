package net.blerf.ftl.ui.contract;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

import net.blerf.ftl.core.EditorConfig;
import net.blerf.ftl.model.Profile;
import net.blerf.ftl.parser.SavedGameParser;
import net.blerf.ftl.ui.Statusbar;

public abstract class IFTLFrame extends JFrame implements ActionListener, Statusbar, Thread.UncaughtExceptionHandler {
  abstract public void init();
  abstract public EditorConfig getConfig();
  abstract public JButton createAboutButton();
  abstract public JButton createUpdatesButton();
  abstract public void setVersionHistory( Map<Integer, List<String>> historyMap );
  abstract public void loadProfile( Profile p ) throws IOException;
  abstract public void updateProfile( Profile p ) throws IOException;
  abstract public SavedGameParser.SavedGameState getGameState();
  abstract public void loadGameState( SavedGameParser.SavedGameState gs );
  abstract public void updateGameState( SavedGameParser.SavedGameState gs );
  abstract public void setDisposeNormally( boolean b );
}