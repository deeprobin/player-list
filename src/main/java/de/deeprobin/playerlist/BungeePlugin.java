package de.deeprobin.playerlist;

import de.deeprobin.playerlist.listener.ServerListListener;
import net.md_5.bungee.api.plugin.Plugin;
import org.bstats.bungeecord.Metrics;

public final class BungeePlugin extends Plugin {

    @Override
    public void onEnable(){
        this.getProxy().getPluginManager().registerListener(this, new ServerListListener(this));
        new Metrics(this);
    }

}
