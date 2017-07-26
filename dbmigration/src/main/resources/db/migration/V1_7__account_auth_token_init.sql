CREATE TABLE account_auth_token (
    account_auth_id BIGSERIAL NOT NULL,
    account_id bigint NOT NULL,
    token varchar(100) NOT NULL,
    create_at TIMESTAMP WITH TIME ZONE NOT NULL,
    last_used TIMESTAMP WITH TIME ZONE NOT NULL,

    PRIMARY KEY (account_auth_id),
    UNIQUE(account_id,token)
);