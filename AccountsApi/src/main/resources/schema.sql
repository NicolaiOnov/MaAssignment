IF NOT EXISTS ( SELECT * FROM sys.databases WHERE name = 'MaDemo' ) EXEC('CREATE DATABASE MaDemo');

USE MaDemo;

BEGIN TRANSACTION;

DROP TABLE IF EXISTS Accounts
CREATE TABLE Accounts (
	Id BIGINT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	Number NVARCHAR(30) UNIQUE NOT NULL,
	BalanceInCents DECIMAL(19, 0) NOT NULL DEFAULT 0,
	Currency NVARCHAR(3) NOT NULL,
	LastOperation DATETIME2(7) NULL
);

DROP PROCEDURE IF EXISTS SelectAllAccounts;
CREATE PROCEDURE SelectAllAccounts
AS
SELECT [Id]
      ,[Number]
      ,[BalanceInCents]
      ,[Currency]
      ,[LastOperation]
FROM Accounts;

COMMIT;