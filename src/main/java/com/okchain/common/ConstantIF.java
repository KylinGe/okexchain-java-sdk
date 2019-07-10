package com.okchain.common;

public interface ConstantIF {
    public static String CHAIN_ID = "okchain";
    public static String ADDRESS_PREFIX = "okchain";

    //public static String HD_PATH = "m/44'/118'/0'/0/0";
    public static String HD_PATH = "M/44H/996H/0H/0/0";
    //url path
    public static String ACCOUNT_URL_PATH = "/auth/accounts/";
    public static String TRANSACTION_URL_PATH = "/txs";

    public static String GET_ACCOUNT_ALL_TOKENS_URL_PATH = "/accounts/";

    public static String GET_ACCOUNT_TOKEN_URL_PATH = "/accounts/";

    public static String GET_TOKENS_URL_PATH = "/tokens";

    public static String GET_TOKEN_URL_PATH = "/token/";

    public static String GET_PRODUCTS_URL_PATH = "/products";

    public static String GET_DEPTHBOOK_URL_PATH = "/order/depthbook";

    public static String GET_CANDLES_URL_PATH = "/candles/";

    public static String GET_TICKERS_URL_PATH = "/tickers";

    public static String GET_ORDERLIST_OPEN_URL_PATH = "/order/list/open";

    public static String GET_ORDERLIST_CLOSED_URL_PATH = "/order/list/closed";

    public static String GET_DEALS_URL_PATH = "/deals";

    public static String GET_TRANSACTIONS_URL_PATH = "/transactions";

    public static String RPC_METHOD_TX_SEND_BLOCK = "broadcast_tx_commit";

    public static String RPC_METHOD_TX_SEND_SYNC = "broadcast_tx_sync";

    public static String RPC_METHOD_TX_SEND_ASYNC = "broadcast_tx_async";

    public static String TX_SEND_MODE_BLOCK = "block";

    public static String TX_SEND_MODE_SYNC = "sync";

    public static String TX_SEND_MODE_ASYNC = "async";


}
