package xlrtrum.messages.responses;

import java.util.List;

import xlrtrum.utility.TxHashHeightWrapper;

/**
 * Created by mingxiao on 2018.3.19.
 */

public class StatusHistory {

    private String address;
    private List<TxHashHeightWrapper> txHashHeight;
    private String status;

    public StatusHistory(String address, List<TxHashHeightWrapper> txHashHeight, String status) {
        this.address = address;
        this.txHashHeight = txHashHeight;
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public List<TxHashHeightWrapper> getTxHashHeight() {
        return txHashHeight;
    }

    public String getStatus() {
        return status;
    }
}
